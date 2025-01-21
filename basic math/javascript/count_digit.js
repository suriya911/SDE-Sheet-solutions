const readline = require('readline')

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
})

rl.question('Enter a number: ', (number) => {

    let count = Math.floor(Math.log10(number)) + 1

    console.log(`Number of digits in ${number} is ${count}`)
    
    rl.close()
})