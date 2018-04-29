from django.shortcuts import render
from django.shortcuts import HttpResponse
from django.shortcuts import render
from django.shortcuts import redirect
# Create your views here.
USER_LIST = [
    {'id': 1, 'username': 'alex', 'email': 'asdfasdf', "gender": '男'},
    {'id': 2, 'username': 'eriuc', 'email': 'asdfasdf', "gender": '男'},
    {"id": 3,'username': 'seven', 'email': 'asdfasdf', "gender": '男'},
]
def home(request):
    print(request.GET.get('nid'))



    if request.method == "POST":
        # 获取用户提交的数据 POST请求中
        u = request.POST.get('username')
        e = request.POST.get('email')
        g = request.POST.get('gender')
        temp = {'username': u, 'email': e, "gender": g}
        USER_LIST.append(temp)
    return render(request, 'test/home.html', {'user_list':  USER_LIST})



def login(request):
    error_msg=""
    if request.method =="POST":
        user = request.POST.get('user', None)
        pwd= request.POST.get('pwd', None)
        print(user,pwd)
        if user == "root" and pwd=="123":
            return redirect('http://www.baidu.com')
        error_msg="用户名或密码错误"
    return render(request,'login.html',{"error_msg":error_msg})