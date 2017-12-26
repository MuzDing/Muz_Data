letter = '''
        Dear{stlutation} {name},
        Thank you for your letter .we are sorry that out{product} {verbed} in your
        {room}. Please note that it should never be used in a {room},especially n
        near any{animals}

        Send us your receipt and {amount} for shipping and handling.we will send
        you another {product} that,in our tests,is {percent}% less likely to
        hava {verbed}.
        Thank you for your support

        Sincerely,
        {spokesman}
        {job_title}
        '''
response = {'stlutation':'a',
            'name':'b',
            'product':'c',
            'verbed':'d',
            'room':'e',
            'animals':'f',
            'percent':'g',
            'spokesman':'h',
            'job_title':'i',
            'amount':'j'}

print(letter.format(**response))
