package tochka.test.second

case class TreeNode[X](value: X, left: Option[TreeNode[X]], right: Option[TreeNode[X]])

object TreeNode extends App {
  val simpleP = TreeNode(1, None, None)
  val simpleQ = TreeNode(1, None, None)
  assert(isSameTree(Some(simpleP), Some(simpleQ)))
  assert(isSameTreeSimplified(Some(simpleP), Some(simpleQ)))
  val p = TreeNode(1, Some(TreeNode(2, None, None)), None)
  val q = TreeNode(1, None, Some(TreeNode(2, None, None)))
  assert(!isSameTree(Some(p), Some(q)))
  assert(!isSameTreeSimplified(Some(p), Some(q)))

  def isSameTree[X](first: Option[TreeNode[X]], second: Option[TreeNode[X]]): Boolean = {
    if (first.isEmpty || second.isEmpty)
      first.isEmpty && second.isEmpty
    else
      (first.get.value == second.get.value) && isSameTree(first.get.left, second.get.left) && isSameTree(first.get.right, second.get.right)
  }
  //just another version, actually here we dont need explicit recursion because case class implements deep recursive equals by default
  def isSameTreeSimplified[X](first: Option[TreeNode[X]], second: Option[TreeNode[X]]): Boolean = {
    first == second
  }

}

