# -*- coding:utf-8 -*-  
__author__ = 'Muz'
__date__ = '18-4-3 下午7:44'
import json
def func():
    f = open("concepts.csv","r")
    concepts_dict ={}
    for row in f:
        # print(row.strip('\n'))
        if row[:1] is not ',':
            concepts_dict[row]={}
            row_list=list(row)
            list_count = [] #记录,的位置
            str=''
            for i in range(len(row_list)):
                if row_list[i] is ',':
                    concepts_dict[row]
                else:
                    str += row_list[i]



    # data = f.readline()
    #
    # print(type(data))

    f.close()

{
    "机器学习":[{
        "线性模型":[{
            "线性回归":[{
                "最小二乘法":[]
            }]
        }]
    },{
        "神经网络":[{
            "神经元模型":[{
                "激活函数":[]
            }],
            "多层网络":[{
                "感知机":[],
                "连接权":[]
            }]
        }]
    },{
        "强化学习":[{
            "有模型学习":[{
                "策略评估":[],
                "策略改进":[]
            }],
            "免模型学习":[{
                "蒙特卡罗方法":[],
                "时序差分学习":[]
            }],
            "模仿学习":[{
                "直接模仿学习":[],
                "逆强化学习":[]
            }]

        }]
    }],
}
{
    "机器学习":[{
        "线性模型":[{
            "线性回归":[{
                "最小二乘法":[]
            }]
        }]
    },{
        "神经网络":[{
            "神经元模型":[{
                "激活函数":[]
            }],
            "多层网络":[{
                "感知机":[],
                "连接权":[]
            }]
        }]
    },{
        "强化学习":[{
            "有模型学习":[{
                "策略评估":[],
                "策略改进":[]
            }],
            "免模型学习":[{
                "蒙特卡罗方法":[],
                "时序差分学习":[]
            }],
            "模仿学习":[{
                "直接模仿学习":[],
                "逆强化学习":[]
            }]

        }]
    }],
}
class Main():
    def __init__(self):
        pass


if __name__ == '__main__':
    # s1=json.dumps(s)
    # print(json.loads(s1))
    func()