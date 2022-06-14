roll=function(){
  
  die=1:6
  
  dice=sample(die, size=1, replace=TRUE)
  
  return(sum(dice))
  
}





sum_roll = function(){
  data1=replicate(10,roll())
  sum_data<-mean(data1)
  return(sum_data)
}

result = replicate(3p, sum_roll())
hist(result, 20)

