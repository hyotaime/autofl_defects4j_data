# 0. Starting container 
```
docker run -dt --name autofl_data -v $(pwd)/workspace:/root/workspace agb94/fonte:latest
docker exec -it autofl_data bash
```

# 1. Extracting data

## 1-1. Only suspicious methods (AutoFL settings)
```bash
python extract_suspicious.py # This extracts the method snippet of the suspicious methods in sbfl_method_ranks_full.json 
```

## 1-2. All methods 
```bash
python extract_all.py # This extracts the method snippet of the all methods
```

You can specify the target projects by modifying the `TARGET_PROJECTS` variable.
```python
import json
import os
import time
import shutil
import re

TARGET_PROJECTS = ["Lang", "Chart", "Time", "Math", "Closure"]
JAVA_ANALYZER = "./java_analyzer/target/java-analyzer-1.0-SNAPSHOT-shaded.jar"
SKIP_EXIST = True
```