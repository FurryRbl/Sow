import numpy as np
import os
from PIL import Image

# 获取Blender路径
print("输入Blender渲染出图每一帧存放的文件夹：",end="");
BlenderImages = input();
if not os.path.exists(BlenderImages):
    print("文件夹不存在！");
    exit(1);


print("输入拼接后输出文件夹：",end="");
OutImages = input();
if not os.path.exists(OutImages):
    print("文件夹不存在！");
    exit(1);


png_list = [];
for root, dirs, files in os.walk(BlenderImages):
    for file in files:
        if os.path.splitext(file)[1] == '.png':
            png_list.append(os.path.join(root, file));


img = ''
img_np = ''

for i, v in enumerate(png_list):
    if i == 0:
        img = Image.open(v)
        img_np = np.array(img)
    if i > 0:
        img_np2 = np.array(Image.open(v))
        img_np = np.concatenate((img_np, img_np2), axis=0)
        img = Image.fromarray(img_np)
img.save(OutImages + '/' + 'result.png')

