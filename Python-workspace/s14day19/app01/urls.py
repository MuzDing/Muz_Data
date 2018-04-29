# -*- coding:utf-8 -*-  
__author__ = 'Muz'
__date__ = '18-3-28 下午10:10'


"""s14day19 URL Configuration

The `urlpatterns` list routes URLs to views. For more information please see:
    https://docs.djangoproject.com/en/2.0/topics/http/urls/
Examples:
Function views
    1. Add an import:  from my_app import views
    2. Add a URL to urlpatterns:  path('', views.home, name='home')
Class-based views
    1. Add an import:  from other_app.views import Home
    2. Add a URL to urlpatterns:  path('', Home.as_view(), name='home')
Including another URLconf
    1. Import the include() function: from django.urls import include, path
    2. Add a URL to urlpatterns:  path('blog/', include('blog.urls'))
"""
from django.contrib import admin
from django.urls import path
from app01 import views
urlpatterns = [
    path('admin/', admin.site.urls),
    path('index/', views.index),
    path('login/', views.login),
    path('user_info/', views.userinfo),
    path('userdetail-<int:nid>/', views.userdetail),
    path('userdel-<int:nid>/', views.userdel),
    path('useredit-<int:nid>/', views.useredit),
#     path('detail-/', views.detail),
    path('orm/', views.orm),
]
