from faker import Faker
fake = Faker()
for i, _ in enumerate(range(5000), 1):
    print(f" {fake.first_name()} {fake.last_name()} {i}")