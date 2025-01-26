const readline = require("readline");

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

function printNTo1(n) {
    if (n < 1) {
        return;
    }
    console.log(n);
    printNTo1(n - 1);
}

rl.question("Enter a number: ", function(n) {
    printNTo1(n);
    rl.close();
});