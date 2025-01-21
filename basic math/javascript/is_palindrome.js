const readline = require('readline')

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
})

rl.question('Enter a number: ', (number) => {

    const num = parseInt(number,10)

    var reverse = parseInt(num.toString().split('').reverse().join(''))

    if (Math.abs(num) === Math.abs(reverse)) {
        console.log(`${number} is a palindrome`)
    } else {
        console.log(`${number} is not a palindrome`)
    }
    rl.close()
})