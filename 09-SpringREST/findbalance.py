from urllib import request
import json


no=input('Enter account number : ')

print("Account Number",no)

response=request.urlopen("http://localhost:8080/bank/api/search/number/"+no)
data=response.read()
info=json.loads(data)
#print(info)
print("Name :",info['accnm'])
print("Balance :",info['balance'])

