from django.db import models

# Create your models here.
class UserInfo(models.Model):
    #id自增列
    username = models.CharField(max_length=32)
    password = models.CharField(max_length=64)