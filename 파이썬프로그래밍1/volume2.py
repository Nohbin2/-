CANS_PER_PACK = 6

userInput = input("Please enter the trice for a six-pack: ")
packPrice = float(userInput)

userInput = input("Please enter the volume for each can (in ounces): ")
canVolume = float(userInput)

packVolume = canVolume * CANS_PER_PACK

pricePerOunce = packPrice / packVolume
print("Price per ounce: %8.2f" % pricePerOunce)
