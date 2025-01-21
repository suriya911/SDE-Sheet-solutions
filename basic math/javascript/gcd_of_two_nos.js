const readline = require('readline')

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
})

const gcd = (num1, num2) => {
    while (num2) {
        let temp = num2
        num2 = num1 % num2
        num1 = temp
    }
    return num1
}

rl.question('Enter two numbers separated by space: ', (answer) => {
    let [num1, num2] = answer.split(' ')
    console.log(`GCD of ${num1} and ${num2} is: ${gcd(num1, num2)}`)
    rl.close()
})
