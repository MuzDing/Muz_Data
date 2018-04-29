from django.shortcuts import render,HttpResponse,redirect


# Create your views here.
# USER_DICT = {
#     'k1':'root1',
#     'k2':'root2',
#     'k3':'root3',
# }
USER_DICT = {
    '1':{'name':'root1','email':'root@163.com'},
    '2':{'name':'root2','email':'root@163.com'},
    '3':{'name':'root3','email':'root@163.com'},
    '4':{'name':'root4','email':'root@163.com'},

}
def index(request):
    return render(request,'index.html')

def userinfo(request):
    if request.method =='GET':
        user_list = models.UserInfo.objects.all()

        return render(request,'user_info.html',{'user_list':user_list})
    elif request.method == "POST":
        u=request.POST.get("user")
        p=request.POST.get("pwd")

        models.UserInfo.objects.create(username=u,password=p)
        return redirect("/app01/user_info/")
def userdel(request,nid):
    models.UserInfo.objects.filter(id=nid).delete()
    return redirect("/app01/user_info/")
def useredit(request,nid):
    if request.method =="GET":
        obj =models.UserInfo.objects.filter(id=nid).first()
        return render(request,'user_edit.html',{'obj':obj})
    elif request.method == "POST":
        nid = request.POST.get("id")
        u = request.POST.get("username")
        p = request.POST.get("password")
        print(nid,p,u)
        models.UserInfo.objects.filter(id=nid).update(username=u,password=p)
        return redirect("/app01/user_info/")
    return redirect("/app01/user_info/")

def userdetail(request,nid):
    detail_info = models.UserInfo.objects.filter(id=nid).first()
    return render(request,'detail.html',{'detail_info':detail_info})
# def login(request):
#     if request.method == "GET":
#         return render(request,'login.html')
#     elif request.method == "POST":
#         u = request.POST.get('user')
#         p = request.POST.get('pwd')
#
#         # v=request.POST.get("gender")
#         # print(v)
#         # v=request.POST.getlist('favor')  #多选用getlist()
#         # print(v)
#         obj = request.FILES.get("fff")
#         import os
#         filepath = os.path.join('upload',obj.name)
#         f = open(filepath,mode='wb')
#         for i in obj.chunks():
#             f.write(i)
#         f.close()
#         print(obj)
#         if u =="root" and p=="123":
#             return redirect("/index ")
#         else:
#             return render(request, 'login.html')
#     else:
#         return redirect("/index")

def login(request):
    # models.UserGroup.objects.create(caption='DBA')

    if request.method == "GET":
        return render(request, 'login.html')
    elif request.method == "POST":
        # 数据库中执行 select * from user where usernam='x' and password='x'
        u = request.POST.get('user')
        p = request.POST.get('pwd')
        # obj = models.UserInfo.objects.filter(username=u,password=p).first()
        # print(obj)# obj None,
        # count = models.UserInfo.objects.filter(username=u, password=p).count()
        obj = models.UserInfo.objects.filter(username=u, password=p).first()
        if obj:
            return redirect('/app01/index/')
        else:
            return render(request, 'login.html')
    else:
        # PUT,DELETE,HEAD,OPTION...
        return redirect('/index/')



def detail(request,nid):
    detail_info = USER_DICT[str(nid)]
    return render(request,'detail.html',{'detail_info':detail_info})
    # return HttpResponse(nid)

# def detail(request):
#     nid = request.GET.get("nid")
#     print(nid)
#     detail_info = USER_DICT[nid]
#     return render(request,'detail.html',{'detail_info':detail_info})

from app01 import models
def orm(request):
    #增
    # models.UserInfo.objects.create(username="root",password="123")
    # obj = models.UserInfo.objects.create(username="muz",password="muz")
    # obj.save()
    # dic={'username':'xin','password':'123'}
    # models.UserInfo.objects.create(**dic)

    #查询
    # result = models.UserInfo.objects.all()
    # result =models.UserInfo.objects.filter(username='root')
    # for row in result:
    #     print(row.username,row.password)

    #删除
    # models.UserInfo.objects.filter(username="root").delete()

    #修改
    models.UserInfo.objects.filter(username="root").update(password="000")
    return HttpResponse('orm ')