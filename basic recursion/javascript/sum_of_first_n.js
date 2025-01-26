const readline = require("readline");

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

function sumOfFirstN(n) {
    if (n <= 0) {
        return 0;
    }
    return n + sumOfFirstN(n - 1);
}

rl.question("Enter a number: ", function(n) {
    n = parseInt(n);
    console.log("Sum of first", n, "natural numbers is:", sumOfFirstN(n));
    rl.close();
});