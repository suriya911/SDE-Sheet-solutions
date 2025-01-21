const readline = require('readline')

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
})

function allDivisors(number) {
    let divisors = []
    for (let i = 1; i*i <= number; i++) {
        if (number % i === 0) {
            divisors.push(i)
            if (i !== number/i) {
                divisors.push(number/i)
            }
        }
    }
    return divisors
}

rl.question('Enter a number: ', (number) => {
    number = parseInt(number)
    console.log(allDivisors(number))
    rl.close()
})