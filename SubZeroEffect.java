document.addEventListener("DOMContentLoaded", function() {
    const asciiArt = [
        "  ______     __    __     ______     ______     __    __     ______    ",
        " /\\  ___\\   /\\ \"-./  \\   /\\  ___\\   /\\  ___\\   /\\ \"-./  \\   /\\  __ \\   ",
        " \\ \\___  \\  \\ \\ \\-./\\ \\  \\ \\  __\\   \\ \\ \\____  \\ \\ \\-./\\ \\  \\ \\  __ \\  ",
        "  \\/\\_____\\  \\ \\_\\ \\ \\_\\  \\ \\_____\\  \\ \\_____\\  \\ \\_\\ \\ \\_\\  \\ \\_\\ \\_\\ ",
        "   \\/_____/   \\/_/  \\/_/   \\/_____/   \\/_____/   \\/_/  \\/_/   \\/_/\\/_/ "
    ];

    const asciiElement = document.getElementById("ascii-art");
    let currentLine = 0;
    let currentChar = 0;

    function typeCharacter() {
        if (currentLine < asciiArt.length) {
            if (currentChar < asciiArt[currentLine].length) {
                asciiElement.textContent += asciiArt[currentLine][currentChar];
                currentChar++;
                setTimeout(typeCharacter, 50); // Adjust typing speed here
            } else {
                asciiElement.textContent += "\n";
                currentLine++;
                currentChar = 0;
                setTimeout(typeCharacter, 50);
            }
        }
    }

    typeCharacter();
});