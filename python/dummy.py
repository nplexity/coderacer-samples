/*dummy.py*/
/*Python*/
/*https://github.com/django/django/blob/master/django/core/cache/backends/dummy.py*/

def delete(self, key, version=None):
   key = self.make_key(key, version=version)
   self.validate_key(key)

def get_many(self, keys, version=None):
   return {}

def has_key(self, key, version=None):
   key = self.make_key(key, version=version)
   self.validate_key(key)
   return False

def set_many(self, data, timeout=DEFAULT_TIMEOUT, version=None):
   pass

def delete_many(self, keys, version=None):
   pass

def clear(self):
   pass
