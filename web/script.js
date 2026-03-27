document.getElementById("form").addEventListener("submit", function(e) {
    e.preventDefault();

    let name = document.getElementById("name").value;

    if (name === "") {
        document.getElementById("output").innerText = "Enter something!";
    } else {
        document.getElementById("output").innerText = "Hello " + name;
    }
});