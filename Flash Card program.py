import time
def makeCards(x):
    print("Please Put Term below")
    for i in range(x):
        term = input("term:")
        definition = input("definition:")
        terms.append(term)
        definitions.append(definition)

def easy(x):
    for i in range(x):
        print("Term:",terms[i])

        response = input("")
        if response == "":
            print("Definition:", definitions[i])
            print("\n")
            time.sleep(2)
        else:
            print("Press enter for the definition ")
            lll = input("")
            while lll != "":
                print("Press enter for the definition ")
                lll = input("")

            print(definitions[i])
            print("\n")
            time.sleep(2)

def medium(x,score):
    for i in range(x):

        wordcurrent = terms[i]
        score += len(wordcurrent)/2 * 100
        print("Definition:", definitions[i])
        response = input("")
        if response.lower() == wordcurrent.lower():
            print("\n")
            print("Definition:", definitions[i])

            print("Term:",terms[i])
            print("PLUS 100 POINTS!")
            score += 100
            print("\n")
            time.sleep(2)
        else:
            times = -1
            print("Wrong Word")
            ooo = input("")
            score -= 100
            while ooo.lower() != wordcurrent.lower():
                times+=1
                score -= 25
                print("Wrong Word, do you want a hint? y or n")
                lll = input("")
                if lll == "y":

                    if times >= len(wordcurrent)/2:
                        print("Oh No need to work on this one")
                        time.sleep(3)
                        print("Definition:", definitions[i])
                        time.sleep(2)
                        print("\n")
                        print("Term:", terms[i])
                        time.sleep(2)
                        print("\n")
                        break
                    for m in range(times):
                        print(wordcurrent[m], end = "")
                    for q in range(times,len(wordcurrent)):
                        if wordcurrent[q] == " ":
                            print(" ", end = "")
                        else:
                            print("_", end = "")
                print("\n")
                ooo = input("")
            print("Definition:", definitions[i])
            time.sleep(2)
            print("Term:",terms[i])
            time.sleep(2)
            time.sleep(5)


def hard(x,score):
    for i in range(x):

        wordcurrent = definitions[i]
        score += len(wordcurrent)/2 * 100
        print("Term:",terms[i])
        response = input("")
        if response.lower() == wordcurrent.lower():
            print("\n")
            print("Term:",terms[i])

            print("Definition:", definitions[i])
            print("PLUS 200 POINTS!")
            score += 200
            print("\n")
            time.sleep(2)
        else:
            print("Wrong definition")
            ooo = input("")
            times = -1
            score -= 200
            while ooo.lower() != wordcurrent.lower():
                times+=1
                score -= 50
                print("Wrong definition, do you want a hint? y or n")
                lll = input("")
                if lll == "y":
                    if times >= len(wordcurrent)/2:
                        print("Oh No need to work on this one")
                        time.sleep(3)
                        print("Term:", terms[i])
                        time.sleep(2)
                        print("\n")
                        print("Definition:", definitions[i])
                        time.sleep(2)
                        print("\n")
                    for m in range(times):
                        print(wordcurrent[m], end = "")
                    for q in range(times,len(wordcurrent)):
                        if wordcurrent[q] == " ":
                            print(" ", end = "")
                        else:
                            print("_", end = "")
                print("\n")
                ooo = input("")
            print("Term:",terms[i])
            time.sleep(2)
            print("Definition:", definitions[i])
            time.sleep(2)
            time.sleep(5)

def restart(score):
    print('Enter STOP to stop the review')
    time.sleep(2)
    diff = ""
    while diff != "STOP":
        print("Here is your current SCORE:", score)
        print("What difficulty would you like to play on?")
        time.sleep(3)
        print("1: Easy      2: Medium       3:Hard")
        diff = (input(""))
        if diff == "STOP":
            break
        if diff == "1":
            easy(x)
        elif diff == "2":
            medium(x,score)
        elif diff == "3":
            hard(x,score)
        else:
            break

terms = []
definitions = []
score = 0
print("Welcome to Flash cardmaker!")
time.sleep(3)
print("What difficulty would you like to play on?")
time.sleep(3)
print("1: Easy      2: Medium       3:Hard")
diff = int(input(""))
print("How many cards would you like to make today?")
try:
    x = int(input(""))
except:
    print("Please enter in a numerical value!")
    x = int(input(":"))
makeCards(x)
if diff == 1:
    easy(x)
elif diff == 2:
    medium(x,score)
else:
    hard(x,score)
restart(score)
time.sleep(5)
print("\n")
print("Glad you learned something today!")
