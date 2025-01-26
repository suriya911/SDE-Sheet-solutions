const readline = require("readline");

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

function repeatString(str, n) {
    if (n <= 0) {
        return "";
    }
    return str + repeatString(str, n - 1);
}

rl.question("Enter a string: ", function(str) {
    rl.question("Enter the number of times to repeat: ", function(n) {
        n = parseInt(n);
        if (isNaN(n) || n <= 0) {
            console.log("Please enter a valid positive integer.");
        } else {
            const result = repeatString(str, n);
            console.log(`The string "${str}" repeated ${n} times is:`)
            console.log(result);
        }
        rl.close();
    });
});