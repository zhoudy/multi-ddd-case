# DDD简化版多模块示例


# 工程规划

| 服务ID | 端口   | 服务名称   | 描述            |
|--------|------|--------|---------------|
| multi-ddd-case   | xx   | xx     | 父工程           |
| bootstrap  | 8090 | 启动入口   | none          |
| showcase-facade   | xx   | 接口工程   | DDD的API接口单独暴露 |
| showcase-service | xx   | 领域服务工程 | DDD领域、服务、资源等  |
| showcase-common | xx   | 通用工具类  | none     |

# 工程说明
本规范参考于蚂蚁工程规范，主要目的用户规范DDD规范下的工程目录及包结构。
对于showcase-service中包含比较多的领域实体、值对象、聚合、领域服务、资源库、基础设施等，为了控制模块不要过多，
同时考虑到一般性项目的体量，做了适当裁剪，当然您可以对本工程在进行模块化拆解，如果你愿意。

# 优化建议
请联系我E-mail：cqyd505@163.com