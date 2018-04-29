# -*- coding:utf-8 -*-  
__author__ = 'Muz'
__date__ = '18-4-9 上午9:15'
from django.urls import path
from df_user import views
urlpatterns = [
    path('register/',views.register),
    path('register_handle/',views.register_handle),
    path('login/',views.login),
    path('register_exist/',views.register_exist),
    path('login_handle/',views.login_handle),
    path('info/',views.info),
    path('site/', views.site),
]
