## 任务一：

1.类图 

![](http://www.plantuml.com/plantuml/png/RL6zJZCn4Epz52wJ8dc1-nJbIvE68Y90WoWskILO-EoJVmJXuDtnUksJ5L7jxdXdTaRU-W0kn44BPGAwLpYZF5gNsabe2_rYsGcVPgeN30SDXjeVSTRWlTp5qqbZ9Ho3K-OYnxJKaTxpYuH4_u2HEOMqH_oYTQuol25tdM0XwNF91n_gOpQ2WJPuqChWOnOUmNcipl0Jpp4W7sn2tIa3oUfKF8pMgw2ioQA7Cd38s_49TCGcD4abdRgLGbOndxp4K6XKWltl75mNovbRMPCeXgJcceqKhA7oNJHna7jde-adoYHTbyk5owcRtJJ1aeUzZQxVNU_1l9EGAvL-f1BuGFkFShNwtaZk-Oy8-WlXLh2nZ5JLYgtNIQgacXF_QpS9HJvv2sqAeSws7cpTjlWMJHy7_Gi0)

时序图

![](http://www.plantuml.com/plantuml/png/XP0nRiCm34LtdKAZCoG7q12aHO4ksJfqbcswDi1O1aMYQKzVAdHTJVKYYe_I_n-yP8x4SaCNEqxaSPh1n-olMbV48xm2V0CLRhTraXEnuMTfMuGtxRVX9qtRS1Y0e7z_a3-ZsA9vsTMvOkgFvrB28jmS_4lawAVPrVhwmbA436oeEJX3lxzH3raKbqwPEGHEJqJnItajU3pNNS0K-sQDTqAOFtZyzttMiWNOibrJMZpSeHC6dTOxC8Mw3uzbDGHPa4zyvzqF0qeUztKxJBdONs3kvOO_)



2.在java中，一切都可看作对象，example的设计理念亦是如此，在“老爷爷指挥七个葫芦娃按排行顺序站成一队”的场景中，将老爷爷，葫芦娃，''队伍"，队伍中的"position"，以及排序算法都看作对象，这样做的好处是代码简洁易读，一目了然；什么对象分配什么任务，清清楚楚；同时可操作性强，便于他人修改，将排序算法以一个更加抽象的接口作为底层实现，在引入新的排序算法时只需依样画瓢即可。

可改进之处：BubbleSorter的实现可以修改，目前是每两个position对象交换位置就需要swap()一次，例如对于一个逆序数组，冒泡排序将2号位移至100号位，需要将2,3; 3,4; 4,5;......99,100;都交换一次，而实际上真正有意义的只是将2号位移动到第100号位，其余数字向前推移就行，无需swap()，由于每次swap()后结果都要输出，即2号到达100号中每次交换都要输出，这也是为何当怪物数量增至256时排序耗时极长的原因，而选择排序就不会出现这种情况，因为选择排序是选定两个数直接swap()。

## 任务二：

类图：

![](http://www.plantuml.com/plantuml/png/bL6zJiCm4Dxz51xReNs1eAfqgP10gYYm80OtFOg5OqV-4PJGTyTtEKTHCx7uVkpxVixh49MFgJ52smZ-NTKWzyxdj1F6gUDiNecGQumdY3kZBAONKHiLWjo3WJfgPylCFdfjJxBDxog4V7sJAYDygNOyTcS3-FY_cOqBeHDuolW1Mu0Vy9NeCMIWG1AVoYL91sR1mcWBpuJPAX-WU85lg5E4dckqXdjjrS50n_oj2ngT4kYE2rhBf7nH9i58Eq9bdF8g-ojW8Mj9l5mAqTrwhywp-J1RfZh1WgJf8mdXtdYKUC6cHZva0jmmcfA-ed3gmw4Qv0nYICJM9N_Sd1-L_KGap_4YhhvQBXQ_AzddWlzpUe7VbHlJ6XF1-gXHr0pDvJB3iBt1-ituANO1wQQj5G-KsX7Xr0DVN1lWxXhiCJNc3m00)

视频地址：

选择排序：https://www.bilibili.com/video/BV1644y147zD?spm_id_from=333.999.0.0 （256个）

插入排序：https://www.bilibili.com/video/BV13q4y1o7Km?spm_id_from=333.999.0.0（256个排序时间过长，因此我将其改成64个）



## 任务三：

并未修改类以及类中函数，类图同任务二：

![](http://www.plantuml.com/plantuml/png/bL6zJiCm4Dxz51xReNs1eAfqgP10gYYm80OtFOg5OqV-4PJGTyTtEKTHCx7uVkpxVixh49MFgJ52smZ-NTKWzyxdj1F6gUDiNecGQumdY3kZBAONKHiLWjo3WJfgPylCFdfjJxBDxog4V7sJAYDygNOyTcS3-FY_cOqBeHDuolW1Mu0Vy9NeCMIWG1AVoYL91sR1mcWBpuJPAX-WU85lg5E4dckqXdjjrS50n_oj2ngT4kYE2rhBf7nH9i58Eq9bdF8g-ojW8Mj9l5mAqTrwhywp-J1RfZh1WgJf8mdXtdYKUC6cHZva0jmmcfA-ed3gmw4Qv0nYICJM9N_Sd1-L_KGap_4YhhvQBXQ_AzddWlzpUe7VbHlJ6XF1-gXHr0pDvJB3iBt1-ituANO1wQQj5G-KsX7Xr0DVN1lWxXhiCJNc3m00)



视频地址：

选择排序：https://www.bilibili.com/video/BV1uL411478k?spm_id_from=333.999.0.0 (16x16）

插入排序：https://www.bilibili.com/video/BV1z44y147LU?spm_id_from=333.999.0.0 (同任务2，插入排序16x16时间过长，改为8x8)

