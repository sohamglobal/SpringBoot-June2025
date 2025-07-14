import requests

cid=input('Enter carId : ')
mnm=input('Enter model name : ')
comp=input('Enter company : ')
pri=float(input('Enter price : '))

data={
    "carid":cid,
    "modelnm":mnm,
    "company":comp,
    "price":pri
}

url="http://localhost:8013/auto/api/add"
response=requests.post(url,json=data)

if response.status_code==200:
    print("success")
else:
    print("failed")