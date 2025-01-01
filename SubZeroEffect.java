document.addEventListener("DOMContentLoaded", function() {
    const asciiArt = `
  ______     __    __     ______     ______     __    __     ______    
 /\\  ___\\   /\\ "-./  \\   /\\  ___\\   /\\  ___\\   /\\ "-./  \\   /\\  __ \\   
 \\ \\___  \\  \\ \\ \\-./\\ \\  \\ \\  __\\   \\ \\ \\__ \\  \\ \\ \\-./\\ \\  \\ \\  __ \\  
  \\/\\_____\\  \\ \\_\\ \\ \\_\\  \\ \\_____\\  \\ \\_____\\  \\ \\_\\ \\ \\_\\  \\ \\_\\ \\_\\ 
   \\/_____/   \\/_/  \\/_/   \\/_____/   \\/_____/   \\/_/  \\/_/   \\/_/\\/_/ 
    `;
    const quoteText = "Within the folds of being, an essence clings, born of nature’s rhythm and neglect.";
    const asciiArtElement = document.getElementById("ascii-art");
    const quoteElement = document.getElementById("quote");
    const linkElement = document.getElementById("link-section");

    // Function to type text with a delay
    async function typeText(element, text, delay = 50) {
        for (let char of text) {
            element.textContent += char;
            await new Promise(resolve => setTimeout(resolve, delay));
        }
    }

    // Function to start the typing effect
    async function startTypingEffect() {
        // Type ASCII art
        await typeText(asciiArtElement, asciiArt, 10);

        // Type quote
        quoteElement.style.opacity = 1;
        await typeText(quoteElement, quoteText, 50);

        // Fade in link
        linkElement.style.opacity = 1;
    }

    // Start typing effect on page load
    startTypingEffect();
});