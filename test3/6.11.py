class Quote():
    def __init__(self,person,words):
        self.person = person
        self.words = words
    def who(self):
        return self.person
    def says(self):
        return self.words+'.'
class QuestionQuote(Quote):
    def says(self):
        return self.words+'?'
class ExclamationQuote(Quote):
    def says(self):
        return self.words+'!'

hunter = Quote("a","b")
print(hunter.person,'says:',hunter.words)

hunter1 = QuestionQuote("a","b")
print(hunter1.person,'says:',hunter1.words)

hunter2 = ExclamationQuote("a","b")
print(hunter2.person,'says:',hunter2.words)


class BabblingBrook():
    def who(self):
        return 'brook'
    def says(self):
        return 'Babble'

brook = BabblingBrook()
print(brook.who(),'say:',brook.says())

def who_says(obj):
    print(obj.who(),'say',obj.says())
who_says(hunter)
who_says(hunter1)
who_says(hunter2)