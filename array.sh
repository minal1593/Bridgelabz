declare -a students=("priya " "swarna" "rutuja" "swayam" "hitesh" "1234")

#echo ${students[4]} ${students[2]}
#echo ${#students[2]}
students+=("bharath" "chitali")
echo ${students[@]}

unset students[5]
echo ${students[@]}
