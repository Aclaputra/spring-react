curl --location --request POST 'http://localhost:9191/addemployees' \
  --header 'Content-Type: application/json' \
  --data-raw '[
      {
        "name": "Nautilus",
        "position": "Algorithm Engineer Intern",
        "salary": 22000
      },
      {
        "name": "Alca",
        "position" "Love Doctor",
        "salary": 34000
      }
  ]'
