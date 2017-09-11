object mergesort {

  def msort(xs: List[Int]): List[Int] = {
    val n = xs.length / 2
    if (n == 0) xs
    else {
      def merge(xs: List[Int], ys: List[Int]) = (xs, ys) match {
        case (Nil, ys) => ys
        case (xs, Nil) => xs
        case ( x :: xs1, y :: ys1 ) =>
          if (x < y) x :: merge(xs1, ys1)
          else y :: merge(xs, ys)
      }

      val (fst, snd) = xs splitAt n
      merge(msort(fst), msort(snd))
    }
  }
}