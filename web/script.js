document.getElementById("form").addEventListener("submit", function(e) {
    e.preventDefault();

    let name = document.getElementById("name").value;
    let output = document.getElementById("output");

    if (name === "") {
        output.innerText = "Enter your name!";
    } else {
        output.innerText = "Hello " + name;
    }

    output.style.opacity = "1";
});