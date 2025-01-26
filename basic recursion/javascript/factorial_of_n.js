const readline = require("readline");

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

function factorial(n) {
    if (n === 0) {
        return 1;
    }
    return n * factorial(n - 1);
}

rl.question("Enter a number: ", function (n) {
    n = parseInt(n);
    console.log(`Factorial of ${n} is ${factorial(n)}`);
    rl.close();
});