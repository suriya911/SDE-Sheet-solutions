const readline = require('readline')

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
})

rl.question('Enter a number: ', (number) => {

    const isNegative = number < 0

    const reverse = parseInt(number.toString().split('').reverse().join(''))

    console.log(`Reverse of ${number} is ${isNegative ? -reverse : reverse}`)
    rl.close()
})