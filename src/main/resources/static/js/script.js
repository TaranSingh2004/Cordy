console.log("Script loader");

let currentTheme = getTheme(); // Get the saved theme from localStorage
changeTheme(); // Set up event listener and apply the theme

// Function to toggle theme
function changeTheme() {
    const changeThemeButton = document.querySelector("#theme_change_button");

    if (!changeThemeButton) {
        console.error("Button with ID #theme_change_button not found!");
        return;
    }

    // Apply the theme on page load
    changePageTheme(currentTheme);

    changeThemeButton.addEventListener("click", () => {
        console.log("Button clicked");

        const oldTheme = currentTheme;
        currentTheme = currentTheme === "dark" ? "light" : "dark";

        setTheme(currentTheme);
        changePageTheme(currentTheme, oldTheme);
    });
}

// Function to apply the theme to the page
function changePageTheme(theme, oldTheme = null) {
    if (oldTheme) {
        document.querySelector("html").classList.remove(oldTheme);
    }
    document.querySelector("html").classList.add(theme);

    // Update button text
    const changeThemeButton = document.querySelector("#theme_change_button");
    if (changeThemeButton) {
        changeThemeButton.querySelector("span").textContent = theme === "light" ? "Dark" : "Light";
    }
}

// Function to save theme in localStorage
function setTheme(theme) {
    localStorage.setItem("theme", theme);
}

// Function to get the saved theme from localStorage
function getTheme() {
    return localStorage.getItem("theme") || "light"; // Default to light theme
}
