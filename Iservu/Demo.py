import statistics as st
def mean(data):
  return (sum(data)/len(data))
def median(data):
  data.sort()
if len(data) % 2 == 1:
  return data[len(data)//2]
else:
  return ((data[len(data)//2]+ data[len(data)//2-1])/2)

def mode(data):
  counts={}
  for number in data:
    if number in counts:
      counts[number]+= 1
    else:
      counts[number] = 1

max_count=0
mode=None
for number,count in counts.items():
 if count>max_count:
   max_count=count
   mode=number

return mode
def mean_median_mode(input_string):
  # code goes here
  dat = input_string.split(" ")
  data = []
  for i in dat:
    if(i.isnumeric()):
      data.append(int(i))
  a=mean(data)
  b=median(data)
  c=mode(data)
  if(int(a)!=a):
    a=round(a,1)
  if(int(b)!=b):
    b=round(b,1)
  if(int(c)!=c):
    c=round(c,1)
  return ("Mean:"+str(a)+"Median:"+str(b)+"Mode"+str(c))

# keep this function call here
print(mean_median_mode(params))
