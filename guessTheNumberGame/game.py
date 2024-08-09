import random

# check flg if max number is greater than min number.
checkFlg = True

# check if max number is greater than min number.
while checkFlg:
    minNumber = int(input("input minimum number: "))
    maxNumber = int(input("input maximum number: "))
    if minNumber >= maxNumber:
        # if max number is not greater than min number, input numbers again.
        print("ERROR: Minimum number is greater than maximum number.")
        print("Enter numbers again")
    else:
        checkFlg = False

# get random number between min number and max number.
randomNumber = random.randint(minNumber,maxNumber)

# get a count number how many a player guess.
count = 2

# continue until count become 0.
while count > 0:
    guessNumber = int(input("guess a number between " + str(minNumber) + " and " + str(maxNumber) + ": "))
    if randomNumber == guessNumber:
        print("Congrats!! You Won!!")
        break
    elif randomNumber != guessNumber:
        # if a player's guess is off, reduce count.
        count -= 1
        if count != 0:
            print("Nope! You have just " + str(count) + " times to go.")
        else:
            # if count get 0, a player lost.
            print("You lost...")
            break