import os

# Directory to save the files
output_dir = "./patterns/c++/"
os.makedirs(output_dir, exist_ok=True)

# Create 22 JavaScript files
for i in range(2, 23):
    filename = f"pattern{i}.cpp"
    filepath = os.path.join(output_dir, filename)
    with open(filepath, "w") as file:
        file.write(f"// {filename} - Auto-generated file\n")
    print(f"Created: {filename}")

print("All files created successfully in the 'output_files' directory.")
