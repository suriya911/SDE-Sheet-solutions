const readline = require("readline");

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

function reverseArray(arr, start, end) {
    if (start >= end) {
        return;
    }
    [arr[start], arr[end]] = [arr[end], arr[start]];
    reverseArray(arr, start + 1, end - 1);
}

rl.question("Enter the elements of the array separated by spaces: ", function(input) {
    const arr = input.split(" ");
    reverseArray(arr, 0, arr.length - 1);
    console.log("Reversed array:", arr.join(" "));
    rl.close();
});