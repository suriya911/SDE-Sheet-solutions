const readline = require("readline");

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

function repeatName(name, n) {
    if (n <= 0) {
        return "";
    }
    return name + repeatName(name, n - 1);
}

rl.question("Enter the number of times to repeat: ", function(n) {
    n = parseInt(n);
    name = "name_repeat "
    if (isNaN(n) || n <= 0) {
        console.log("Please enter a valid positive integer.");
    } else {
        const result = repeatName(name, n);
        console.log(`The name "${name}" repeated ${n} times is:`)
        console.log(result);
    }
    rl.close();
});
