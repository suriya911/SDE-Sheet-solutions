const readline  = require("readline");

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

function print1ToN(n) {
    if (n < 1) {
        return;
    }
    print1ToN(n - 1);
    console.log(n);
}
rl.question("Enter a number: ", function(n) {
    print1ToN(n);
    rl.close();
});
