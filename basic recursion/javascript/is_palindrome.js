const readline = require("readline");

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

function isPalindrome(str) {
    str = str.toLowerCase().replace(/[^a-z0-9]/g, ''); // Normalize the string
    return str === str.split('').reverse().join('');
}   

rl.question("Enter a string to check if it's a palindrome: ", function(input) {
    if (isPalindrome(input)) {
        console.log(`"${input}" is a palindrome.`);
    } else {
        console.log(`"${input}" is not a palindrome.`);
    }
    rl.close();
});