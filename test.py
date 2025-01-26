import shutil
import os

# # Directory to save the files
# output_dir = "./patterns/c++/"
# os.makedirs(output_dir, exist_ok=True)


# Define the source and destination folders
source_folder = "./basic recursion/c++"
destination_folder = "./basic recursion/javascript"

# Create the destination folder if it doesn't exist
if not os.path.exists(destination_folder):
    os.makedirs(destination_folder)

# Iterate over the files in the source folder
for filename in os.listdir(source_folder):
    if filename.endswith(".cpp"):  # Check if the file has a .cpp extension
        # Create the new filename with a .js extension
        new_filename = os.path.splitext(filename)[0] + ".js"
        # Define the full paths for source and destination
        source_path = os.path.join(source_folder, filename)
        destination_path = os.path.join(destination_folder, new_filename)
        # Copy the file to the destination with the new extension
        shutil.copy(source_path, destination_path)

print(f"Files have been copied and converted to the {
      destination_folder} folder with .js extensions.")
