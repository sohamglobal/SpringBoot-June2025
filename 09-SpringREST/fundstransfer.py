import requests

# API endpoint
url = "http://localhost:8080/bank/api/acc/transfer"


fno=int(input("Enter from account number: "))
tno=int(input("Enter to account number: "))
amt=float(input("Enter amount to transfer: "))

# Data to send
params = {
    "fromacc": fno,
    "toacc": tno,
    "amount": amt  
}

# Call the API using PUT method
response = requests.put(url, params=params)

# Print the response
print("Status Code:", response.status_code)
print("Response Body:", response.text)
