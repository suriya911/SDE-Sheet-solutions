const readline = require('readline')

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
})

const isArmstrong = (num) => {
    let temp = num
    let sum = 0
    while (temp) {
        let digit = temp % 10
        sum += digit ** 3
        temp = parseInt(temp / 10)
    }
    return sum === num
}

rl.question('Enter a number: ', (answer) => {
    let num = parseInt(answer)
    console.log(`${num} is ${isArmstrong(num) ? '' : 'not '}an Armstrong number`)
    rl.close()
})
