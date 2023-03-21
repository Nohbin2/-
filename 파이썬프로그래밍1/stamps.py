stamp_price = 49

dollars = int(input("돈 :"))

firstStamps = 100 * dollars // stamp_price
change = 100 * dollars - firstStamps * stamp_price
print("First class stamps: %6d" % firstStamps)
print("Penny stamps:      %6d" % change)
