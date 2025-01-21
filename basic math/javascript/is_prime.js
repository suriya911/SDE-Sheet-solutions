const readline = require('readline')

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
})

function isPrime(number) {
    if (number < 2) {
        return false
    }
    for (let i = 2; i*i <= number; i++) {
        if (number % i === 0) {
            return false
        }
    }
    return true
}

rl.question('Enter a number: ', (number) => {
    number = parseInt(number)
    if(isPrime(number)){
        console.log(`${number} is prime`)
    } else {
        console.log(`${number} is not prime`)
    }
    rl.close()
})