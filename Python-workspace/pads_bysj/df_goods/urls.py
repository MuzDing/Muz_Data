from django.conf.urls import url
from django.urls import path
from df_goods import views

urlpatterns=[
    # path('site/', views.site),
    url(r'^$',views.index),
    url(r'^list(\d+)_(\d+)_(\d+)/$',views.goodlist),
    url(r'^(\d+)/$', views.detail),
]