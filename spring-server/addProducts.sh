curl --location --request POST 'http://localhost:9191/addproducts' \
  --header 'Content-Type: application/json' \
  --data-raw '[
    {
       "name": "x",
       "quantity": 3,
       "price": 33000
    },
    {
       "name": "y",
       "quantity": 5,
       "price": 12000
    }
]'
