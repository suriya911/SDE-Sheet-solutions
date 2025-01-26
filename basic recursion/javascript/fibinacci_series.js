const readline = require("readline");

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

function fibonacci(n) {
    if (n <= 1) {
        return n;
    }
    return fibonacci(n - 1) + fibonacci(n - 2);
}

function fibonacciSeries(n) {
    let series = [];
    for (let i = 0; i < n+1; i++) {
        series.push(fibonacci(i));
    }
    return series;
}

rl.question("Enter the number of terms in the Fibonacci series: ", function(n) {
    n = parseInt(n);
    if (isNaN(n) || n <= 0) {
        console.log("Please enter a valid positive integer.");
    } else {
        const series = fibonacciSeries(n);
        console.log(`Fibonacci series up to ${n} terms:`, series);
    }
    rl.close();
});