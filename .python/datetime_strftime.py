"""
January 20th(Sat), 2018
PM 08:07:19
"""
import datetime

import _script_run_utf8
_script_run_utf8.main()

now = datetime.datetime.now()
print(now.strftime("%B %dth(%a), %Y."))
print(now.strftime("%p %I:%M:%S"))
