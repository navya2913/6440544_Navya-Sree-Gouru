console.log("Welcome to the Earth Day Portal!");
window.onload = () => alert("Celebrate Earth Day 2025 with your local community!");

// Earth Day Event class
class Event {
  constructor(name, date, seats, category) {
    this.name = name;
    this.date = new Date(date);
    this.seats = seats;
    this.category = category;
  }
  checkAvailability() {
    return this.seats > 0 && this.date >= new Date();
  }
}

// Earth Day events
let events = [
  new Event("Beach Cleanup Drive", "2025-04-22", 20, "cleanup"),
  new Event("Recycling Workshop", "2025-04-23", 10, "workshop"),
  new Event("Plant a Tree Campaign", "2025-04-24", 0, "awareness"),
  new Event("Sustainable Living Talk", "2025-04-25", 15, "awareness"),
];

// Closure to track registrations per category
function createRegistrationTracker() {
  const totals = {};
  return function(category) {
    totals[category] = (totals[category] || 0) + 1;
    return totals[category];
  };
}
const trackRegistration = createRegistrationTracker();

const eventsContainer = document.getElementById("eventsContainer");
const categoryFilter = document.getElementById("categoryFilter");
const searchInput = document.getElementById("searchInput");
const registrationForm = document.getElementById("registrationForm");
const formMessage = document.getElementById("formMessage");
const eventSelect = registrationForm.elements["event"];

function renderEvents(filterCategory = "all", searchTerm = "") {
  eventsContainer.innerHTML = "";
  let filteredEvents = events.filter(ev => ev.checkAvailability());

  if (filterCategory !== "all") {
    filteredEvents = filteredEvents.filter(ev => ev.category === filterCategory);
  }

  if (searchTerm.trim()) {
    filteredEvents = filteredEvents.filter(ev => ev.name.toLowerCase().includes(searchTerm.toLowerCase()));
  }

  if (filteredEvents.length === 0) {
    eventsContainer.innerHTML = "<p>No Earth Day events match your criteria.</p>";
    return;
  }

  filteredEvents.forEach(ev => {
    const card = document.createElement("div");
    card.className = "eventCard";
    card.innerHTML = `
      <h3>${ev.name}</h3>
      <p><strong>Date:</strong> ${ev.date.toDateString()}</p>
      <p><strong>Seats left:</strong> ${ev.seats}</p>
      <p><strong>Category:</strong> ${ev.category}</p>
      <button ${ev.seats === 0 ? "disabled" : ""}>Register</button>
    `;

    const btn = card.querySelector("button");
    btn.onclick = () => handleRegistration(ev);
    eventsContainer.appendChild(card);
  });

  populateEventSelect(filteredEvents);
}

function populateEventSelect(eventList) {
  eventSelect.innerHTML = '<option value="">Select an event</option>';
  eventList.forEach(ev => {
    const option = document.createElement("option");
    option.value = ev.name;
    option.textContent = `${ev.name} (${ev.date.toDateString()})`;
    eventSelect.appendChild(option);
  });
}

function handleRegistration(eventObj) {
  alert(`You clicked Register for "${eventObj.name}". Fill out the form below.`);
  eventSelect.value = eventObj.name;
  window.location.hash = "#registrationSection";
}

registrationForm.addEventListener("submit", (e) => {
  e.preventDefault();
  formMessage.textContent = "";

  const name = registrationForm.elements["name"].value.trim();
  const email = registrationForm.elements["email"].value.trim();
  const selectedEventName = registrationForm.elements["event"].value;

  const eventObj = events.find(ev => ev.name === selectedEventName);

  try {
    if (!name || !email || !selectedEventName) {
      throw new Error("Please fill in all fields.");
    }
    if (!eventObj || !eventObj.checkAvailability()) {
      throw new Error("Event not available.");
    }

    eventObj.seats--;
    trackRegistration(eventObj.category);

    formMessage.textContent = `Thank you ${name}, you're registered for "${eventObj.name}"! 🌿`;
    formMessage.style.color = "green";
    registrationForm.reset();
    renderEvents(categoryFilter.value, searchInput.value);

  } catch (error) {
    formMessage.textContent = error.message;
    formMessage.style.color = "red";
  }
});

categoryFilter.addEventListener("change", () => {
  renderEvents(categoryFilter.value, searchInput.value);
});

searchInput.addEventListener("keydown", () => {
  setTimeout(() => renderEvents(categoryFilter.value, searchInput.value), 100);
});

renderEvents();
